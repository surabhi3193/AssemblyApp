package com.example.mindinfo_android.assemblyapp.p.other;

import android.app.Activity;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mindinfo_android.assemblyapp.R;


/**
 * Created by Mind Info- Android on 08-Dec-17.
 */

public class familyAdapter extends ArrayAdapter<String> {

    private static LayoutInflater inflater = null;
    View vi;
    private int total_number;
    private Activity context;

    public familyAdapter(Activity context, int total_number) {
        super(context, R.layout.contacts_list_item);
        this.context = context;
        this.total_number = total_number;
        inflater = context.getLayoutInflater();

    }

    @Override
    public int getCount() {
        System.out.println("**********total family member ******* " + total_number);
        return 5;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        vi = view;
        final ViewHolder holder = new ViewHolder();
        if (view == null) {
            vi = inflater.inflate(R.layout.contacts_list_item, null);

            holder.nameEt = (EditText) vi.findViewById(R.id.nameET);
            holder.relationEt = (TextView) vi.findViewById(R.id.relationEt);

            final ViewHolder finalHolder1 = holder;
            holder.relationEt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openSelector(finalHolder1.relationEt);
                }
            });

        }
        return vi;
    }


    public void openSelector(final TextView filter)

    {
        final PopupMenu popup = new PopupMenu(context, filter);

        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item)
            {

                int id=item.getItemId();

                switch (id)
                {
                    case (R.id.son):

                        filter.setText(item.getTitle());
                        break;

                    case (R.id.daughter):


                        break;

                    default:

                        popup.dismiss();

                        break;

                }
                return true;
            }
        });

        popup.show();
    }
    class ViewHolder {
        EditText nameEt;
        TextView relationEt;
    }

}