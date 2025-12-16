package xis.docs.content;

import java.util.*;
import java.util.regex.*;

public class PageUrl {
    private final String pattern;
    private final Pattern regex;
    private final List<String> variableNames;

    /**
     * Creates PageUrl from pattern from @{@link one.xis.Page} annotation.
     * It might contain path variables like /{var}/page.html.
     *
     * @param pattern
     */
    public PageUrl(String pattern) {
        this.pattern = pattern;
        this.variableNames = new ArrayList<>();
        // Convert /{var}/page.html to regex: /(.*?)/page.html and collect var names
        StringBuilder regexBuilder = new StringBuilder();
        Matcher m = Pattern.compile("\\{([^/}]+)\\}").matcher(pattern);
        int last = 0;
        while (m.find()) {
            regexBuilder.append(Pattern.quote(pattern.substring(last, m.start())));
            regexBuilder.append("(?<").append(m.group(1)).append(">[^/]+)");
            variableNames.add(m.group(1));
            last = m.end();
        }
        regexBuilder.append(Pattern.quote(pattern.substring(last)));
        this.regex = Pattern.compile("^" + regexBuilder + "$", Pattern.CASE_INSENSITIVE);
    }

    /**
     * Matches given url against the pattern.
     *
     * @param url
     * @return Optional.empty() if not matched. Optional of an empty map if matched without path variables.
     * Otherwise Optional of map with path variable names and their values.
     */
    public Optional<Map<String, String>> matches(String url) {
        Matcher m = regex.matcher(url);
        if (!m.matches()) {
            return Optional.empty();
        }
        if (variableNames.isEmpty()) {
            return Optional.of(Collections.emptyMap());
        }
        Map<String, String> result = new LinkedHashMap<>();
        for (String var : variableNames) {
            result.put(var, m.group(var));
        }
        return Optional.of(result);
    }
}
