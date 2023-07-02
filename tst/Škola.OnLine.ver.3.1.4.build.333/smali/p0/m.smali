.class public interface abstract Lp0/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/m$b;
    }
.end annotation


# static fields
.field public static final a:Lp0/m$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:Lp0/m$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/m$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/m$b$c;-><init>(Lp0/m$a;)V

    sput-object v0, Lp0/m;->a:Lp0/m$b$c;

    new-instance v0, Lp0/m$b$b;

    invoke-direct {v0, v1}, Lp0/m$b$b;-><init>(Lp0/m$a;)V

    sput-object v0, Lp0/m;->b:Lp0/m$b$b;

    return-void
.end method
