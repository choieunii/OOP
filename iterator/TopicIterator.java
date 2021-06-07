package iterator;

public class TopicIterator implements Iterator<Topic> {

    private Topic[] topics;
    private int cnt;

    public TopicIterator(Topic[] topics)
    {
        this.topics = topics;
        cnt = 0;
    }

    @Override
    public void reset() {
        cnt = 0;
    } // 0로 리셋

    @Override
    public Topic next() {
        return topics[cnt++];
    } // 다음 요소 리턴

    @Override
    public Topic currentItem() {
        return topics[cnt]; // 현재의 요소 리턴
    }

    @Override
    public boolean hasNext() { // 다음 요소가 있는지 여부 판별
        if(cnt >= topics.length)
            return false;
        return true;
    }
}