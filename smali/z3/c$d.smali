.class public Lz3/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz3/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lz3/c;


# direct methods
.method public constructor <init>(Lz3/c;)V
    .locals 0

    iput-object p1, p0, Lz3/c$d;->a:Lz3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lw3/b;)V
    .locals 2

    invoke-virtual {p1}, Lw3/b;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lz3/c$d;->a:Lz3/c;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lz3/c;->C()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lz3/c;->o(Lz3/i;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz3/c$d;->a:Lz3/c;

    invoke-static {v0}, Lz3/c;->V(Lz3/c;)Lz3/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz3/c$d;->a:Lz3/c;

    invoke-static {v0}, Lz3/c;->V(Lz3/c;)Lz3/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lz3/c$b;->e(Lw3/b;)V

    :cond_1
    return-void
.end method
