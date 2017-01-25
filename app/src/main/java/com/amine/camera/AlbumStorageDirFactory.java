package com.amine.camera;

import java.io.File;

/**
 * Created by amine on 25/01/17.
 */

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
