import { NestedListViewPage } from './app.po';

describe('nested-list-view App', () => {
  let page: NestedListViewPage;

  beforeEach(() => {
    page = new NestedListViewPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
