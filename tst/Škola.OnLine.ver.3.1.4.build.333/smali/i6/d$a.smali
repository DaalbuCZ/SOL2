.class Li6/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li6/d;->i()Lg6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li6/d;


# direct methods
.method constructor <init>(Li6/d;)V
    .locals 0

    iput-object p1, p0, Li6/d$a;->a:Li6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Li6/d$a;->b(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7

    new-instance v6, Li6/e;

    iget-object v0, p0, Li6/d$a;->a:Li6/d;

    invoke-static {v0}, Li6/d;->e(Li6/d;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Li6/d$a;->a:Li6/d;

    invoke-static {v0}, Li6/d;->f(Li6/d;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Li6/d$a;->a:Li6/d;

    invoke-static {v0}, Li6/d;->g(Li6/d;)Lg6/d;

    move-result-object v4

    iget-object v0, p0, Li6/d$a;->a:Li6/d;

    invoke-static {v0}, Li6/d;->h(Li6/d;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Li6/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lg6/d;Z)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, Li6/e;->i(Ljava/lang/Object;Z)Li6/e;

    invoke-virtual {v6}, Li6/e;->r()V

    return-void
.end method
