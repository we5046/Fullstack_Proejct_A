package org.scoula.common.util;

public class UploadFileName {
    public static String getUniqueName(String filename) {
        // 주의! 확장명이 반드시 있다는 가정입니다.
        int ix = filename.lastIndexOf(".");
        String name = filename.substring(0, ix);            // 파일명 추출
        String ext = filename.substring(ix+1);    // 확장명 추출

        return String.format("%s-%d.%s", name, System.currentTimeMillis(), ext);
    }
}
