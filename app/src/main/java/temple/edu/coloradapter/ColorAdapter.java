package temple.edu.coloradapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view;

        if( convertView instanceof TextView ){
            view = (TextView) convertView;
        }else view = new TextView(context);

        view.setText( colors[position] );
        view.setTextSize(24);
        view.setPadding(12,12,12,12);

        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView view;

        view = (TextView) this.getView(position, convertView, parent);
        view.setBackgroundColor(Color.parseColor( colors[position] ));

        return view;
    }

}
