.class public final synthetic Lv7/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lt8/j;

.field public final synthetic o:Lt8/k$d;

.field public final synthetic p:Lv7/i;


# direct methods
.method public synthetic constructor <init>(Lt8/j;Lt8/k$d;Lv7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/v;->n:Lt8/j;

    iput-object p2, p0, Lv7/v;->o:Lt8/k$d;

    iput-object p3, p0, Lv7/v;->p:Lv7/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/v;->n:Lt8/j;

    iget-object v1, p0, Lv7/v;->o:Lt8/k$d;

    iget-object v2, p0, Lv7/v;->p:Lv7/i;

    invoke-static {v0, v1, v2}, Lv7/c0;->d(Lt8/j;Lt8/k$d;Lv7/i;)V

    return-void
.end method
