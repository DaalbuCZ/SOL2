.class public final synthetic Lu2/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu2/h0;


# direct methods
.method public synthetic constructor <init>(Lu2/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/f0;->n:Lu2/h0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu2/f0;->n:Lu2/h0;

    invoke-static {v0}, Lu2/h0;->y(Lu2/h0;)V

    return-void
.end method
