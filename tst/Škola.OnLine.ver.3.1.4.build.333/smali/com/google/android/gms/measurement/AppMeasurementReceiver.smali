.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Lw/a;
.source ""

# interfaces
.implements Lu4/j;


# instance fields
.field private p:Lu4/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, Lw/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->p:Lu4/k;

    if-nez v0, :cond_0

    new-instance v0, Lu4/k;

    invoke-direct {v0, p0}, Lu4/k;-><init>(Lu4/j;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->p:Lu4/k;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->p:Lu4/k;

    invoke-virtual {v0, p1, p2}, Lu4/k;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
