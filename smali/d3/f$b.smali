.class final Ld3/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final n:J

.field private final o:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLb5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lb5/q<",
            "Ld3/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld3/f$b;->n:J

    iput-object p3, p0, Ld3/f$b;->o:Lb5/q;

    return-void
.end method


# virtual methods
.method public e(J)I
    .locals 2

    iget-wide v0, p0, Ld3/f$b;->n:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public g(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->a(Z)V

    iget-wide v0, p0, Ld3/f$b;->n:J

    return-wide v0
.end method

.method public h(J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Ld3/f$b;->n:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Ld3/f$b;->o:Lb5/q;

    goto :goto_0

    :cond_0
    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
