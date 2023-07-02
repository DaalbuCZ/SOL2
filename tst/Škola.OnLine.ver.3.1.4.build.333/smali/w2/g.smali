.class public final Lw2/g;
.super Lw2/b;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw2/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:J

.field public final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/g$a;

    invoke-direct {v0}, Lw2/g$a;-><init>()V

    sput-object v0, Lw2/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Lw2/b;-><init>()V

    iput-wide p1, p0, Lw2/g;->n:J

    iput-wide p3, p0, Lw2/g;->o:J

    return-void
.end method

.method synthetic constructor <init>(JJLw2/g$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lw2/g;-><init>(JJ)V

    return-void
.end method

.method static a(Lu3/a0;JLu3/j0;)Lw2/g;
    .locals 1

    invoke-static {p0, p1, p2}, Lw2/g;->b(Lu3/a0;J)J

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lu3/j0;->b(J)J

    move-result-wide p2

    new-instance v0, Lw2/g;

    invoke-direct {v0, p0, p1, p2, p3}, Lw2/g;-><init>(JJ)V

    return-object v0
.end method

.method static b(Lu3/a0;J)J
    .locals 6

    invoke-virtual {p0}, Lu3/a0;->E()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-virtual {p0}, Lu3/a0;->G()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p1

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    goto :goto_0

    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide p0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lw2/g;->n:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lw2/g;->o:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
