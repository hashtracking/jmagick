package magick;

public class PixelInterpolateMethod {

  /*
    Important! Constant values should correspond to:
    http://trac.imagemagick.org/browser/ImageMagick/branches/ImageMagick-6.7.7/magick/compress.h (See PixelInterpolateMethod enum)
   */

  public static final UndefinedInterpolatePixel = 0;
  public static final AverageInterpolatePixel = 1;
  public static final Average9InterpolatePixel = 2;
  public static final Average16InterpolatePixel = 3;
  public static final BackgroundInterpolatePixel = 4;
  public static final BilinearInterpolatePixel = 5;
  public static final BlendInterpolatePixel = 6;
  public static final CatromInterpolatePixel = 7;
  public static final IntegerInterpolatePixel = 8;
  public static final MeshInterpolatePixel = 9;
  public static final NearestInterpolatePixel = 10;
  public static final SplineInterpolatePixel = 11;
}

