package app.com.lentusignavus.popularmovies.database;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by kare2436 on 1/23/16.
 */
public class MovieContract {

    public static final String CONTENT_AUTHORITY = "app.com.lentusignavus.popularmovies.database";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);


    public static class MovieEntry implements BaseColumns {

        public static final String TABLE_NAME = "movie";


        public static final String COLUMN_TRAIL = "trailers";

        public static final String COLUMN_TITLE = "title";

        public static final String COLUMN_IMAGE_URI = "poster_url";

        public static final String COLUMN_RATING = "rating";

        public static final String COLUMN_REAL_DATE = "release_date";

        public static final String COLUMN_DESC = "description";

        public static final String COLUMN_MOVIE_ID = "movie_id";






    }





}
