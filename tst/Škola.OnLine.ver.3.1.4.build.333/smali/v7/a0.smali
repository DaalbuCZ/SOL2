.class public final synthetic Lv7/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv7/i;

.field public final synthetic o:Lt8/j;

.field public final synthetic p:Lt8/k$d;


# direct methods
.method public synthetic constructor <init>(Lv7/i;Lt8/j;Lt8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/a0;->n:Lv7/i;

    iput-object p2, p0, Lv7/a0;->o:Lt8/j;

    iput-object p3, p0, Lv7/a0;->p:Lt8/k$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/a0;->n:Lv7/i;

    iget-object v1, p0, Lv7/a0;->o:Lt8/j;

    iget-object v2, p0, Lv7/a0;->p:Lt8/k$d;

    invoke-static {v0, v1, v2}, Lv7/c0;->c(Lv7/i;Lt8/j;Lt8/k$d;)V

    return-void
.end method
