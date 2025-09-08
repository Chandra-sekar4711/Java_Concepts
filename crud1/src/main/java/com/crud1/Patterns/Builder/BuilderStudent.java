package com.crud1.Patterns.Builder;

import lombok.Builder;
import lombok.Data;

//@Builder
@Data
public class BuilderStudent {
    final int sid;
    final String sname;
    final int sage;
    final String sdept;
    final int Smarks;
    final String Martialstatus;
    final int Ssalary;

    private BuilderStudent(Builder builder)
    {
        this.sid =builder.sid;
        this.sname = builder.sname;
        this.sage =builder.sage;
        this.sdept =builder.sdept;
        this.Smarks =builder.Smarks;
        this.Martialstatus=builder.Martialstatus;
        this.Ssalary = builder.Ssalary;
    }

    public static class Builder {
        int sid;
        String sname;
        int sage;
        String sdept;
        int Smarks;
        String Martialstatus;
        int Ssalary;

        public  Builder (int sid , String sname)
        {
            this.sid = sid;
            this.sname = sname;
        }

        public Builder setSage(int sage) {
            this.sage = sage;
            return this;
        }

        public Builder setSdept(String sdept) {
            this.sdept = sdept;
            return this;
        }

        public Builder setSmarks(int smarks) {
            Smarks = smarks;
            return this;
        }

        public Builder setMartialstatus(String martialstatus) {
            Martialstatus = martialstatus;
            return this;
        }

        public Builder setSsalary(int ssalary) {
            Ssalary = ssalary;
            return this;
        }

        public BuilderStudent build()
        {
            return new BuilderStudent(this);
        }
    }


}

