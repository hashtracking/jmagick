package magick;

public class ColorPacket extends Magick {

	private PixelPacket packet;
	private int index;
	private int count;

    public ColorPacket(PixelPacket packet, int index, int count) {
      this.packet = packet;
      this.index = index;
      this.count = count;
    }

    public PixelPacket getPixelPacket() {
      return this.packet;
    }

    public int getIndex() {
      return this.index;
    }

    public int getCount() {
      return this.count;
    }

    public void setPixelPacket(PixelPacket packet) {
      this.packet = packet;
    }

    public void setIndex() {
      this.index = index;
    }

    public void setCount() {
      this.count = count;
    }

    public String toString() {
      return "ColorPacket(" + getPixelPacket() + "," + getIndex() + "," + getCount() + ")";
    }
}
