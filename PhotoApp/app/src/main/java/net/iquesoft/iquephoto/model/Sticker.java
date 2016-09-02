package net.iquesoft.iquephoto.model;

import android.graphics.Paint;
import android.graphics.Rect;

import net.iquesoft.iquephoto.R;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergey Belenkiy
 *         Stiker - model class how used in {@link net.iquesoft.iquephoto.view.fragment.StickersFragment} class.
 */
public class Sticker {
    private int title;
    private int image;

    private int x, y;

    private Rect stickerArea = new Rect();

    /**
     * Array with "Flag" stickers;
     */
    public static Sticker flagStickers[] = {
            new Sticker(R.string.flag_ukraine, R.drawable.flag_ukraine),
            new Sticker(R.string.flag_russia, R.drawable.flag_russia),
            new Sticker(R.string.flag_germany, R.drawable.flag_germany),
            new Sticker(R.string.flag_brazil, R.drawable.flag_brazil)
    };

    /**
     * Array with "Emoticons" stickers;
     */
    public static Sticker emoticonsStickers[] = {
            new Sticker(R.string.emoticon_happy, R.drawable.emoticon_happy),
            new Sticker(R.string.emoticon_in_love, R.drawable.emoticon_in_love),
            new Sticker(R.string.emoticon_smile, R.drawable.emoticon_smile),
            new Sticker(R.string.emoticon_tongue_out, R.drawable.emoticon_tongue_out),
            new Sticker(R.string.emoticon_sad, R.drawable.emoticon_sad),
            new Sticker(R.string.emoticon_mad, R.drawable.emoticon_mad),
            new Sticker(R.string.emoticon_wink, R.drawable.emoticon_wink),
            new Sticker(R.string.emoticon_quiet, R.drawable.emoticon_quiet),
            new Sticker(R.string.emoticon_unhappy, R.drawable.emoticon_unhappy),
            new Sticker(R.string.emoticon_bored, R.drawable.emoticon_bored),
            new Sticker(R.string.emoticon_ill, R.drawable.emoticon_ill),
            new Sticker(R.string.emoticon_nerd, R.drawable.emoticon_nerd),
            new Sticker(R.string.emoticon_kissing, R.drawable.emoticon_kissing),
            new Sticker(R.string.emoticon_embarrassed, R.drawable.emoticon_embarrassed),
            new Sticker(R.string.emoticon_smart, R.drawable.emoticon_smart),
            new Sticker(R.string.emoticon_surprised, R.drawable.emoticon_surprised)

    };

    public Sticker(int title, int image) {
        this.title = title;
        this.image = image;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    /**
     * @return list with "Flag" stickers;
     */
    public static List<Sticker> getFlagStickersList() {
        return Arrays.asList(flagStickers);
    }

    /**
     * @return list with "Emoticons" stickers;
     */
    public static List<Sticker> getEmoticonsStickersList() {
        return Arrays.asList(emoticonsStickers);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rect getStickerArea() {
        return stickerArea;
    }

    /*public void setStickerArea(Rect stickerArea) {
        if (getText() != null && typeface != null) {
            Paint paint = new Paint();
            setPaintParams(paint);
            paint.getTextBounds(getText(), 0, getText().length(), textArea);
            textArea.top += getSize() + getY() - TEXT_AREA_MARGIN;
            textArea.bottom += getSize() + getY() + TEXT_AREA_MARGIN;
            textArea.left += getX() - TEXT_AREA_MARGIN;
            textArea.right += getX() + TEXT_AREA_MARGIN;
        }
    }*/
}