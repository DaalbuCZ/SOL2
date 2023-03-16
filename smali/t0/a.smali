.class public abstract Lt0/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Ll0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll0/c;

    invoke-direct {v0}, Ll0/c;-><init>()V

    iput-object v0, p0, Lt0/a;->n:Ll0/c;

    return-void
.end method

.method public static b(Ljava/util/UUID;Ll0/i;)Lt0/a;
    .locals 1

    new-instance v0, Lt0/a$a;

    invoke-direct {v0, p1, p0}, Lt0/a$a;-><init>(Ll0/i;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ll0/i;Z)Lt0/a;
    .locals 1

    new-instance v0, Lt0/a$c;

    invoke-direct {v0, p1, p0, p2}, Lt0/a$c;-><init>(Ll0/i;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ll0/i;)Lt0/a;
    .locals 1

    new-instance v0, Lt0/a$b;

    invoke-direct {v0, p1, p0}, Lt0/a$b;-><init>(Ll0/i;Ljava/lang/String;)V

    return-object v0
.end method

.method private f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Ls0/q;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->t()Ls0/b;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2}, Ls0/q;->j(Ljava/lang/String;)Lk0/s;

    move-result-object v2

    sget-object v3, Lk0/s;->p:Lk0/s;

    if-eq v2, v3, :cond_0

    sget-object v3, Lk0/s;->q:Lk0/s;

    if-eq v2, v3, :cond_0

    sget-object v2, Lk0/s;->s:Lk0/s;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-interface {v0, v2, v3}, Ls0/q;->c(Lk0/s;[Ljava/lang/String;)I

    :cond_0
    invoke-interface {p1, p2}, Ls0/b;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method a(Ll0/i;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ll0/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lt0/a;->f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll0/i;->m()Ll0/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll0/d;->l(Ljava/lang/String;)Z

    invoke-virtual {p1}, Ll0/i;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/e;

    invoke-interface {v0, p2}, Ll0/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()Lk0/m;
    .locals 1

    iget-object v0, p0, Lt0/a;->n:Ll0/c;

    return-object v0
.end method

.method g(Ll0/i;)V
    .locals 2

    invoke-virtual {p1}, Ll0/i;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p1}, Ll0/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p1}, Ll0/i;->n()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll0/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method abstract h()V
.end method

.method public run()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lt0/a;->h()V

    iget-object v0, p0, Lt0/a;->n:Ll0/c;

    sget-object v1, Lk0/m;->a:Lk0/m$b$c;

    invoke-virtual {v0, v1}, Ll0/c;->a(Lk0/m$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lt0/a;->n:Ll0/c;

    new-instance v2, Lk0/m$b$a;

    invoke-direct {v2, v0}, Lk0/m$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ll0/c;->a(Lk0/m$b;)V

    :goto_0
    return-void
.end method
