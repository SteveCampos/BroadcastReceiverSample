package pe.appsperu.broadcastreceiversample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneBroadcastReceiver : BroadcastReceiver() {
    companion object {
        const val TAG = "AirplaneBroadcastReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive intent: $intent")
        val action = intent.action
        Log.d(TAG, "intent's action is: $action")


        Toast.makeText(context, "AIRPLANE MODE CHANGED", Toast.LENGTH_LONG).show()
    }
}