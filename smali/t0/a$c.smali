.class Lt0/a$c;
.super Lt0/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt0/a;->c(Ljava/lang/String;Ll0/i;Z)Lt0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Ll0/i;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Z


# direct methods
.method constructor <init>(Ll0/i;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lt0/a$c;->o:Ll0/i;

    iput-object p2, p0, Lt0/a$c;->p:Ljava/lang/String;

    iput-boolean p3, p0, Lt0/a$c;->q:Z

    invoke-direct {p0}, Lt0/a;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 4

    iget-object v0, p0, Lt0/a$c;->o:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/h;->c()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Ls0/q;

    move-result-object v1

    iget-object v2, p0, Lt0/a$c;->p:Ljava/lang/String;

    invoke-interface {v1, v2}, Ls0/q;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lt0/a$c;->o:Ll0/i;

    invoke-virtual {p0, v3, v2}, Lt0/a;->a(Ll0/i;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/room/h;->g()V

    iget-boolean v0, p0, Lt0/a$c;->q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt0/a$c;->o:Ll0/i;

    invoke-virtual {p0, v0}, Lt0/a;->g(Ll0/i;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroidx/room/h;->g()V

    throw v1
.end method
