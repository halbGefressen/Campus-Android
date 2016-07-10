package de.tum.in.tumcampusapp.services;

import android.content.Intent;
import android.widget.RemoteViewsService;

import de.tum.in.tumcampusapp.widgets.RemoteViewFactories.MensaRemoteViewFactory;

/**
 * Created by a2k on 7/6/2015.
 */
public class MensaWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new MensaRemoteViewFactory(this.getApplicationContext(), intent);
    }

}

