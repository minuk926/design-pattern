package com.study.proxy.virtual;

/**
 * <pre>
 * 프록시 객체 내에서 경로 데이터를 지니고 있다가 사용자가 showImage를 호출하면 그때서야 대상 객체를 로드(lazyload)하여, 
 * 이미지를 메모리에 적재하고 대상 객체의 showIMage() 메서드를 위임 호출함으로써, 
 * 실제 메소드를 호출하는 시점에 메모리 적재가 이루어지기 때문에 불필요한 자원낭비가 발생하지 않게 되었다.
 * </pre>
 */
public class UseProxyClient {
    public static void main(String[] args) {
        IImage highResolutionImage1 = new ImageProxy("./img/고해상도이미지_1");
        IImage highResolutionImage2 = new ImageProxy("./img/고해상도이미지_2");
        IImage highResolutionImage3 = new ImageProxy("./img/고해상도이미지_3");

        highResolutionImage2.showImage();
    }
}
