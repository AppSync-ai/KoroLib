package appsync.ai.koro;

import android.content.Context;
import android.widget.Toast;

public class KoroToast {
    /* to show simple toast easily */
    public static void show(Context context, String message) {
        /* message and context is been passed */
        Toast.makeText(context, "" + message, Toast.LENGTH_SHORT).show();
    }
}
