package Iterator;

public class TechnicalSettings implements IterableCollection {
    String[] settings = {"Setting up reminders","Note Settings","Security"};

    @Override
    public Iterator getIterator() {
        return new TechnicalSettingsIterator();
    }

    protected class TechnicalSettingsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < settings.length){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return settings[index++];
            }else{
                return null;
            }
        }

    }
}
