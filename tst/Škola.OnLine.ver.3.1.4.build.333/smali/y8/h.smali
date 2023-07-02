.class public final synthetic Ly8/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly8/j;

.field public final synthetic o:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Ly8/j;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/h;->n:Ly8/j;

    iput-object p2, p0, Ly8/h;->o:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly8/h;->n:Ly8/j;

    iget-object v1, p0, Ly8/h;->o:Ly4/j;

    invoke-static {v0, v1}, Ly8/j;->h(Ly8/j;Ly4/j;)V

    return-void
.end method
