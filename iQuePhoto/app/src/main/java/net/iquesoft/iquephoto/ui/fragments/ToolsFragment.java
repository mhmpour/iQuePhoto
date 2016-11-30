package net.iquesoft.iquephoto.ui.fragments;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.iquesoft.iquephoto.R;
import net.iquesoft.iquephoto.adapter.ToolsAdapter;
import net.iquesoft.iquephoto.mvp.common.BaseFragment;
import net.iquesoft.iquephoto.di.components.EditorComponent;
import net.iquesoft.iquephoto.mvp.models.Tool;
import net.iquesoft.iquephoto.mvp.presenters.fragment.ToolsPresenter;
import net.iquesoft.iquephoto.mvp.views.fragment.ToolsView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ToolsFragment extends BaseFragment implements ToolsView {

    private Unbinder mUnbinder;

    private ToolsAdapter mAdapter;

    @BindView(R.id.toolsRecyclerView)
    RecyclerView recyclerView;

    @Inject
    ToolsPresenter presenter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.getComponent(EditorComponent.class).inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        mUnbinder = ButterKnife.bind(this, view);

        mAdapter = new ToolsAdapter(Tool.getToolsList());

        mAdapter.setOnToolsClickListener(tool -> {
            presenter.setupTool(tool);
        });

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));

        recyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.init(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}