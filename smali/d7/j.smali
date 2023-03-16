.class public Ld7/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/j$b;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method private constructor <init>(Ld7/j$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ld7/j$b;->a(Ld7/j$b;)J

    move-result-wide v0

    iput-wide v0, p0, Ld7/j;->a:J

    invoke-static {p1}, Ld7/j$b;->b(Ld7/j$b;)J

    move-result-wide v0

    iput-wide v0, p0, Ld7/j;->b:J

    return-void
.end method

.method synthetic constructor <init>(Ld7/j$b;Ld7/j$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/j;-><init>(Ld7/j$b;)V

    return-void
.end method
