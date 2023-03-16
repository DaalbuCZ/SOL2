.class public final synthetic Lq8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lq8/j;

.field public final synthetic o:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lq8/j;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/f;->n:Lq8/j;

    iput-object p2, p0, Lq8/f;->o:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq8/f;->n:Lq8/j;

    iget-object v1, p0, Lq8/f;->o:Lt4/j;

    invoke-static {v0, v1}, Lq8/j;->h(Lq8/j;Lt4/j;)V

    return-void
.end method
