package magick;

public interface DitherMethod {
  /*
     Important! Constant values should correspond to:
     http://trac.imagemagick.org/browser/ImageMagick/branches/ImageMagick-6.7.7/magick/quantize.h (see the DitherMethod enum). 
  */
  public final static int UndefinedDither = 0
  public final static int NoDither = 1;
  public final static int RiemersmaDither = 2;
  public static final int FloydSteinbergDither = 3;
}

