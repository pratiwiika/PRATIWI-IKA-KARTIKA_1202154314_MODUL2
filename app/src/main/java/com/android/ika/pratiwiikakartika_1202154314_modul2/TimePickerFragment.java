package com.android.ika.pratiwiikakartika_1202154314_modul2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by ASUS on 2/18/2018.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    /**
     * Creates the time picker dialog with the current time from Calendar.
     * @param savedInstanceState    Saved instance
     * @return TimePickerDialog     The time picker dialog
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker.
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }


    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainMenu activity = (MainMenu) getActivity();
        activity.processTimePickerResult(hourOfDay, minute);
    }

}

