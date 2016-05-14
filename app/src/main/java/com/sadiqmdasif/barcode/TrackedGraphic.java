package com.sadiqmdasif.barcode;

import com.sadiqmdasif.barcode.GraphicOverlay;

/**
 * Created by shahidul on 3/23/16.
 */
abstract class TrackedGraphic<T> extends GraphicOverlay.Graphic {
    private int mId;

    TrackedGraphic(GraphicOverlay overlay) {
        super(overlay);
    }

    void setId(int id) {
        mId = id;
    }

    protected int getId() {
        return mId;
    }

    abstract void updateItem(T item);
}
