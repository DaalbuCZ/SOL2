.class final Lk2/a$b;
.super Lk2/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field public final b:Lu3/a0;


# direct methods
.method public constructor <init>(ILu3/a0;)V
    .locals 0

    invoke-direct {p0, p1}, Lk2/a;-><init>(I)V

    iput-object p2, p0, Lk2/a$b;->b:Lu3/a0;

    return-void
.end method
