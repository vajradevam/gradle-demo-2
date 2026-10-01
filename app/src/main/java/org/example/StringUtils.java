package org.example;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import java.util.List;

/**
 * Skeleton string utilities built on Guava.
 * Exists to prove third-party dependencies resolve correctly
 * after copying the project to another computer.
 */
public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String value) {
        return Strings.isNullOrEmpty(value);
    }

    public static String joinWithComma(Iterable<String> parts) {
        return Joiner.on(", ").skipNulls().join(parts);
    }

    public static List<String> splitOnComma(String value) {
        if (Strings.isNullOrEmpty(value)) {
            return List.of();
        }
        return Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .splitToList(value);
    }

    public static String nullToEmpty(String value) {
        return Strings.nullToEmpty(value);
    }
}
