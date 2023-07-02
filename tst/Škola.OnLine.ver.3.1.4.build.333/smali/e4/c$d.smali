.class public Le4/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le4/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Le4/c;


# direct methods
.method public constructor <init>(Le4/c;)V
    .locals 0

    iput-object p1, p0, Le4/c$d;->a:Le4/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb4/b;)V
    .locals 2

    invoke-virtual {p1}, Lb4/b;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Le4/c$d;->a:Le4/c;

    const/4 v0, 0x0

    invoke-virtual {p1}, Le4/c;->C()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Le4/c;->m(Le4/i;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Le4/c$d;->a:Le4/c;

    invoke-static {v0}, Le4/c;->V(Le4/c;)Le4/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le4/c$d;->a:Le4/c;

    invoke-static {v0}, Le4/c;->V(Le4/c;)Le4/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Le4/c$b;->e(Lb4/b;)V

    :cond_1
    return-void
.end method
