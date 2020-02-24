package com.desgin.pattern.behavioral.chainofresponsibility.mashibing.version2;

/**
 * @author lastwhisper
 */
public class FaceFilter implements Filter {
    // process the face tag <>
    @Override
    public String doFilter(String str) {
        return str.replaceAll("QAQ", "^V^");
    }

}
