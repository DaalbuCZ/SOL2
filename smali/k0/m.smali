.class public interface abstract Lk0/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/m$b;
    }
.end annotation


# static fields
.field public static final a:Lk0/m$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:Lk0/m$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk0/m$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk0/m$b$c;-><init>(Lk0/m$a;)V

    sput-object v0, Lk0/m;->a:Lk0/m$b$c;

    new-instance v0, Lk0/m$b$b;

    invoke-direct {v0, v1}, Lk0/m$b$b;-><init>(Lk0/m$a;)V

    sput-object v0, Lk0/m;->b:Lk0/m$b$b;

    return-void
.end method
