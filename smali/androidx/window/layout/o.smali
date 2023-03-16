.class public final synthetic Landroidx/window/layout/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/window/layout/n$c;

.field public final synthetic o:Landroidx/window/layout/v;


# direct methods
.method public synthetic constructor <init>(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/o;->n:Landroidx/window/layout/n$c;

    iput-object p2, p0, Landroidx/window/layout/o;->o:Landroidx/window/layout/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/window/layout/o;->n:Landroidx/window/layout/n$c;

    iget-object v1, p0, Landroidx/window/layout/o;->o:Landroidx/window/layout/v;

    invoke-static {v0, v1}, Landroidx/window/layout/n$c;->a(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V

    return-void
.end method
