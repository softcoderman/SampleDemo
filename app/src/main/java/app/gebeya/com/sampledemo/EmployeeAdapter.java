package app.gebeya.com.sampledemo;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gebeya-admin on 4/8/17.
 */

public class EmployeeAdapter extends
        RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    Cursor mCursor;
    ListItemClickListnner listItemClickListnner;

    int rowIndex;

    public EmployeeAdapter(Cursor mCursor, ListItemClickListnner listItemClickListnner) {
        this.mCursor = mCursor;
        this.listItemClickListnner = listItemClickListnner;
    }


    public interface ListItemClickListnner {
        void onListItemClicked();
    }


    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_view,viewGroup, false);

        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder employeeViewHolder, int position) {
        if(!mCursor.moveToPosition(position)){
            return;
        }
        employeeViewHolder.bindHolder(mCursor);

    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    public class  EmployeeViewHolder extends RecyclerView.ViewHolder{

        public EmployeeViewHolder(View itemView) {
            super(itemView);

        }
        public void bindHolder(Cursor newCursor)
        {

        }

    }

}
