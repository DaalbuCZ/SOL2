.class public Li7/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/j$b;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method private constructor <init>(Li7/j$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/j$b;->a(Li7/j$b;)J

    move-result-wide v0

    iput-wide v0, p0, Li7/j;->a:J

    invoke-static {p1}, Li7/j$b;->b(Li7/j$b;)J

    move-result-wide v0

    iput-wide v0, p0, Li7/j;->b:J

    return-void
.end method

.method synthetic constructor <init>(Li7/j$b;Li7/j$a;)V
    .locals 0

    invoke-direct {p0, p1}, Li7/j;-><init>(Li7/j$b;)V

    return-void
.end method
