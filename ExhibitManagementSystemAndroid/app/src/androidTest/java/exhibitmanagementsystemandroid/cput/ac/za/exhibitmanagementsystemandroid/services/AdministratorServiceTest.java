package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.test.AndroidTestCase;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.AdministratorService;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.conf.util.App;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.Impl.AdministratorServiceImpl;

/**
 * Created by Bonga on 5/7/2016.
 */
public class AdministratorServiceTest extends AndroidTestCase{
    private AdministratorServiceImpl activateService;
    private boolean isBound;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(App.getAppContext(), AdministratorServiceImpl.class);
        App.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //AdministratorServiceImpl. binder
            //        = (AdministratorServiceImpl.ActivateServiceLocalBinder) service;
            //  activateService = binder.getService();

            //Intent msgIntent = new Intent(AdministratorServiceImpl.class);
            //msgIntent.putExtra(AdministratorServiceImpl.CONNECTIVITY_SERVICE, "");
            //startService(msgIntent);
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;

        }
    };

}
