package magick;

public class PixelInterpolateMethod {

  /*
    Important! Constant values should correspond to:
    http://trac.imagemagick.org/browser/ImageMagick/branches/ImageMagick-6.7.7/magick/compress.h (See PixelInterpolateMethod enum)
   */

  public static final int UndefinedInterpolatePixel = 0;
  public static final int AverageInterpolatePixel = 1;
  public static final int Average9InterpolatePixel = 2;
  public static final int Average16InterpolatePixel = 3;
  public static final int BackgroundInterpolatePixel = 4;
  public static final int BilinearInterpolatePixel = 5;
  public static final int BlendInterpolatePixel = 6;
  public static final int CatromInterpolatePixel = 7;
  public static final int IntegerInterpolatePixel = 8;
  public static final int MeshInterpolatePixel = 9;
  public static final int NearestInterpolatePixel = 10;
  public static final int SplineInterpolatePixel = 11;
}

