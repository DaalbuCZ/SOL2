.class public final Lq2/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq2/c$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lq2/c$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:J

.field public final o:J

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lq2/d;->n:Lq2/d;

    sput-object v0, Lq2/c$b;->q:Ljava/util/Comparator;

    new-instance v0, Lq2/c$b$a;

    invoke-direct {v0}, Lq2/c$b$a;-><init>()V

    sput-object v0, Lq2/c$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    cmp-long v0, p1, p3

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iput-wide p1, p0, Lq2/c$b;->n:J

    iput-wide p3, p0, Lq2/c$b;->o:J

    iput p5, p0, Lq2/c$b;->p:I

    return-void
.end method

.method public static synthetic a(Lq2/c$b;Lq2/c$b;)I
    .locals 0

    invoke-static {p0, p1}, Lq2/c$b;->b(Lq2/c$b;Lq2/c$b;)I

    move-result p0

    return p0
.end method

.method private static synthetic b(Lq2/c$b;Lq2/c$b;)I
    .locals 5

    invoke-static {}, Lb5/k;->j()Lb5/k;

    move-result-object v0

    iget-wide v1, p0, Lq2/c$b;->n:J

    iget-wide v3, p1, Lq2/c$b;->n:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lb5/k;->e(JJ)Lb5/k;

    move-result-object v0

    iget-wide v1, p0, Lq2/c$b;->o:J

    iget-wide v3, p1, Lq2/c$b;->o:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lb5/k;->e(JJ)Lb5/k;

    move-result-object v0

    iget p0, p0, Lq2/c$b;->p:I

    iget p1, p1, Lq2/c$b;->p:I

    invoke-virtual {v0, p0, p1}, Lb5/k;->d(II)Lb5/k;

    move-result-object p0

    invoke-virtual {p0}, Lb5/k;->i()I

    move-result p0

    return p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lq2/c$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lq2/c$b;

    iget-wide v2, p0, Lq2/c$b;->n:J

    iget-wide v4, p1, Lq2/c$b;->n:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lq2/c$b;->o:J

    iget-wide v4, p1, Lq2/c$b;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lq2/c$b;->p:I

    iget p1, p1, Lq2/c$b;->p:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lq2/c$b;->n:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-wide v1, p0, Lq2/c$b;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lq2/c$b;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lq2/c$b;->n:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-wide v1, p0, Lq2/c$b;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lq2/c$b;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d"

    invoke-static {v1, v0}, Lp3/m0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lq2/c$b;->n:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lq2/c$b;->o:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lq2/c$b;->p:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
