.class Ld1/o$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/o$a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/util/List;

.field final synthetic o:Ld1/o$a;


# direct methods
.method constructor <init>(Ld1/o$a;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Ld1/o$a$a;->o:Ld1/o$a;

    iput-object p2, p0, Ld1/o$a$a;->n:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Ld1/o$a$a;->n:Ljava/util/List;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ld1/o$a$a;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-object v3, p0, Ld1/o$a$a;->o:Ld1/o$a;

    iget-object v3, v3, Ld1/o$a;->b:Ld1/o;

    iget-object v4, v3, Ld1/o;->n:Ld1/q1;

    invoke-static {v3}, Ld1/o;->d(Ld1/o;)Z

    move-result v3

    iget-object v5, p0, Ld1/o$a$a;->o:Ld1/o$a;

    iget-object v5, v5, Ld1/o$a;->b:Ld1/o;

    invoke-static {v5}, Ld1/o;->g(Ld1/o;)Z

    move-result v5

    invoke-static {v2, v4, v3, v5}, Ld1/j1;->a(Landroid/view/View;Ld1/q1;ZZ)Ld1/e1;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Ld1/e1;->b(Landroid/view/View;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ld1/o$a$a;->o:Ld1/o$a;

    iget-object v1, v1, Ld1/o$a;->b:Ld1/o;

    invoke-static {v1}, Ld1/o;->i(Ld1/o;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Ld1/o$a$a;->o:Ld1/o$a;

    iget-object v3, v2, Ld1/o$a;->b:Ld1/o;

    iget-object v2, v2, Ld1/o$a;->a:Landroid/app/Activity;

    invoke-static {v3, v2}, Ld1/o;->a(Ld1/o;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
