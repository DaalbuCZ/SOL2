.class final Lx1/j1$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# instance fields
.field public final a:Lx1/y3;

.field public final b:I

.field public final c:J


# direct methods
.method public constructor <init>(Lx1/y3;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/j1$h;->a:Lx1/y3;

    iput p2, p0, Lx1/j1$h;->b:I

    iput-wide p3, p0, Lx1/j1$h;->c:J

    return-void
.end method
