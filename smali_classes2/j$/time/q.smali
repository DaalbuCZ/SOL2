.class public abstract Lj$/time/q;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/time/temporal/k;
.implements Lj$/time/temporal/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    sget-object v1, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    const/4 v2, 0x4

    const/16 v3, 0xa

    const/4 v4, 0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lj$/time/format/r;->l(Lj$/time/temporal/o;III)Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->s()Lj$/time/format/DateTimeFormatter;

    return-void
.end method
