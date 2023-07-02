.class public final Lk3/a;
.super Li3/g;
.source ""


# instance fields
.field private final o:Lk3/b;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "DvbDecoder"

    invoke-direct {p0, v0}, Li3/g;-><init>(Ljava/lang/String;)V

    new-instance v0, Lu3/a0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Lu3/a0;-><init>([B)V

    invoke-virtual {v0}, Lu3/a0;->K()I

    move-result p1

    invoke-virtual {v0}, Lu3/a0;->K()I

    move-result v0

    new-instance v1, Lk3/b;

    invoke-direct {v1, p1, v0}, Lk3/b;-><init>(II)V

    iput-object v1, p0, Lk3/a;->o:Lk3/b;

    return-void
.end method


# virtual methods
.method protected A([BIZ)Li3/h;
    .locals 1

    if-eqz p3, :cond_0

    iget-object p3, p0, Lk3/a;->o:Lk3/b;

    invoke-virtual {p3}, Lk3/b;->r()V

    :cond_0
    new-instance p3, Lk3/c;

    iget-object v0, p0, Lk3/a;->o:Lk3/b;

    invoke-virtual {v0, p1, p2}, Lk3/b;->b([BI)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1}, Lk3/c;-><init>(Ljava/util/List;)V

    return-object p3
.end method
