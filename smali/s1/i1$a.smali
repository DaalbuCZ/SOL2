.class Ls1/i1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/y2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/i1;->r(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls1/i1;


# direct methods
.method constructor <init>(Ls1/i1;)V
    .locals 0

    iput-object p1, p0, Ls1/i1$a;->a:Ls1/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ls1/i1$a;->a:Ls1/i1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ls1/i1;->g(Ls1/i1;Z)Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Ls1/i1$a;->a:Ls1/i1;

    invoke-static {v0}, Ls1/i1;->h(Ls1/i1;)Lp3/n;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lp3/n;->d(I)Z

    return-void
.end method
