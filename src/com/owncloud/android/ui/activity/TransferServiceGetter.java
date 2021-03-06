/* ownCloud Android client application
 *   Copyright (C) 2012 Bartek Przybylski
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.owncloud.android.ui.activity;

import com.owncloud.android.files.services.FileDownloader.FileDownloaderBinder;
import com.owncloud.android.files.services.FileUploader.FileUploaderBinder;

public interface TransferServiceGetter {

    /**
     * Callback method invoked when the parent activity is fully created to get a reference to the FileDownloader service API.
     * 
     * @return  Directory to list firstly. Can be NULL.
     */
    public FileDownloaderBinder getFileDownloaderBinder();

    
    /**
     * Callback method invoked when the parent activity is fully created to get a reference to the FileUploader service API.
     * 
     * @return  Directory to list firstly. Can be NULL.
     */
    public FileUploaderBinder getFileUploaderBinder();


}
