.class public final synthetic Lv7/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lt8/j;

.field public final synthetic o:Lv7/i;

.field public final synthetic p:Lt8/k$d;


# direct methods
.method public synthetic constructor <init>(Lt8/j;Lv7/i;Lt8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/z;->n:Lt8/j;

    iput-object p2, p0, Lv7/z;->o:Lv7/i;

    iput-object p3, p0, Lv7/z;->p:Lt8/k$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/z;->n:Lt8/j;

    iget-object v1, p0, Lv7/z;->o:Lv7/i;

    iget-object v2, p0, Lv7/z;->p:Lt8/k$d;

    invoke-static {v0, v1, v2}, Lv7/c0;->h(Lt8/j;Lv7/i;Lt8/k$d;)V

    return-void
.end method
