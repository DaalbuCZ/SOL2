.class final Lx1/t2$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/f2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:Lz2/p;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz2/u$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lz2/u;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz2/p;

    invoke-direct {v0, p1, p2}, Lz2/p;-><init>(Lz2/u;Z)V

    iput-object v0, p0, Lx1/t2$c;->a:Lz2/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx1/t2$c;->c:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/t2$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx1/t2$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lx1/y3;
    .locals 1

    iget-object v0, p0, Lx1/t2$c;->a:Lz2/p;

    invoke-virtual {v0}, Lz2/p;->Z()Lx1/y3;

    move-result-object v0

    return-object v0
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lx1/t2$c;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lx1/t2$c;->e:Z

    iget-object p1, p0, Lx1/t2$c;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
